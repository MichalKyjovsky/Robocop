// This is a generated file. Not intended for manual editing.
package cz.cuni.mff.kyjovsm.robocop.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RobotFrameworkForLoopIn extends PsiElement {

  @NotNull
  RobotFrameworkForLoopValueList getForLoopValueList();

  @NotNull
  RobotFrameworkForVarIn getForVarIn();

  @NotNull
  List<RobotFrameworkIndentedKeywordInvocationTest> getIndentedKeywordInvocationTestList();

  @NotNull
  List<RobotFrameworkIndentedVariableAssignToKeyword> getIndentedVariableAssignToKeywordList();

}
