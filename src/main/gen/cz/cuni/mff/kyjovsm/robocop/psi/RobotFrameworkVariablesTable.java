// This is a generated file. Not intended for manual editing.
package cz.cuni.mff.kyjovsm.robocop.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RobotFrameworkVariablesTable extends PsiElement {

  @NotNull
  List<RobotFrameworkEmptyLine> getEmptyLineList();

  @NotNull
  List<RobotFrameworkVariablesLine> getVariablesLineList();

  @NotNull
  RobotFrameworkVariablesTableHeader getVariablesTableHeader();

}
