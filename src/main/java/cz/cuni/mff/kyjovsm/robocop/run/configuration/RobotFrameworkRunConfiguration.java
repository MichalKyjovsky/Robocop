package cz.cuni.mff.kyjovsm.robocop.run.configuration;

import com.intellij.execution.ExecutionException;
import com.intellij.execution.Executor;
import com.intellij.execution.configurations.*;
import com.intellij.execution.process.OSProcessHandler;
import com.intellij.execution.process.ProcessHandler;
import com.intellij.execution.process.ProcessHandlerFactory;
import com.intellij.execution.process.ProcessTerminatedListener;
import com.intellij.execution.runners.ExecutionEnvironment;
import com.intellij.openapi.options.SettingsEditor;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


/**
 *
 */
public class RobotFrameworkRunConfiguration extends RunConfigurationBase {

  /**
   * @param project
   * @param factory
   * @param name
   */
  protected RobotFrameworkRunConfiguration(@NotNull Project project, @Nullable ConfigurationFactory factory, @Nullable String name) {
    super(project, factory, name);
  }

  /**
   * @return
   */
  @NotNull
  @Override
  protected RobotFrameworkRunConfigurationOptions getOptions() {
    return (RobotFrameworkRunConfigurationOptions) super.getOptions();
  }

  /**
   * @return
   */
  public String getScriptName() {
    return getOptions().getScriptName();
  }

  /**
   * @return
   */
  public String getExecutionParameters() {
    return getOptions().getTestParams();
  }

  /**
   * @param parameters
   */
  public void setExecutionParameters(String parameters) {
    getOptions().setTestParams(parameters);
  }

  /**
   * @return
   */
  public String getExternalListener() {
    return getOptions().getExternalListener();
  }

  /**
   * @param listeners
   */
  public void setExternalListener(String listeners) {
    getOptions().setExternalListener(listeners);
  }

  /**
   * @return
   */
  public boolean getDryRunMode() {
    return getOptions().getDryRunModeCheckBox();
  }

  /**
   * @param dryRunIsEnabled
   */
  public void setDryRunMode(boolean dryRunIsEnabled) {
    getOptions().setDryRunModeCheckBox(dryRunIsEnabled);
  }

  /**
   * @return
   */
  public boolean getExternalListenersCheckBox() {
    return getOptions().getAddListenerCheckBox();
  }

  /**
   * @param externalListenersAreAdded
   */
  public void setExternalListenersCheckBox(boolean externalListenersAreAdded) {
    getOptions().setAddListenerCheckBox(externalListenersAreAdded);
  }

  /**
   * @param scriptName
   */
  public void setScriptName(String scriptName) {
    getOptions().setScriptName(scriptName);
  }

  /**
   * @return
   */
  @Override
  public @NotNull SettingsEditor<? extends RunConfiguration> getConfigurationEditor() {
    return new RobotFrameworkSettingsEditor();
  }

  /**
   * @throws RuntimeConfigurationException
   */
  @Override
  public void checkConfiguration() throws RuntimeConfigurationException {

  }

  /**
   * @param executor
   * @param environment
   * @return
   */
  @Override
  public @Nullable RunProfileState getState(@NotNull Executor executor, @NotNull ExecutionEnvironment environment) {
    return new CommandLineState(environment) {
      /**
       * @return
       * @throws ExecutionException
       */
      @Override
      protected @NotNull ProcessHandler startProcess() throws ExecutionException {
        GeneralCommandLine commandLine = new GeneralCommandLine(getOptions().getScriptName());
        OSProcessHandler processHandler = ProcessHandlerFactory.getInstance().createColoredProcessHandler(commandLine);
        ProcessTerminatedListener.attach(processHandler);
        return processHandler;
      }
    };
  }
}