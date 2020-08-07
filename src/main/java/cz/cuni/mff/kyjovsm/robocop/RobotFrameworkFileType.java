package cz.cuni.mff.kyjovsm.robocop;

import com.intellij.openapi.fileTypes.LanguageFileType;
import cz.cuni.mff.kyjovsm.robocop.icons.RobotFrameworkIcons;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class RobotFrameworkFileType extends LanguageFileType {
    public static final RobotFrameworkFileType INSTANCE = new RobotFrameworkFileType();

    private RobotFrameworkFileType() {
        super(RobotFrameworkLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "RobotFramework File";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Robot Framework file.";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "robot";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return RobotFrameworkIcons.FILE;
    }
}
