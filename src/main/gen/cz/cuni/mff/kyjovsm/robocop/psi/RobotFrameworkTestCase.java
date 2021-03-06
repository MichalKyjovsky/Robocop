// This is a generated file. Not intended for manual editing.
package cz.cuni.mff.kyjovsm.robocop.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import cz.cuni.mff.kyjovsm.robocop.elements.references.RobotFrameworkNamedElement;
import com.intellij.psi.StubBasedPsiElement;
import cz.cuni.mff.kyjovsm.robocop.elements.stubs.RobotFrameworkTestCaseStub;
import com.intellij.navigation.ItemPresentation;
import com.intellij.util.IncorrectOperationException;

public interface RobotFrameworkTestCase extends RobotFrameworkNamedElement, StubBasedPsiElement<RobotFrameworkTestCaseStub> {

  @NotNull
  List<RobotFrameworkEmptyLine> getEmptyLineList();

  @NotNull
  List<RobotFrameworkTestCaseLine> getTestCaseLineList();

  @NotNull
  RobotFrameworkTestCaseName getTestCaseName();

  @Nullable
  @NonNls
  String getName();

  PsiElement setName(@NonNls @NotNull String newName) throws IncorrectOperationException;

  @Nullable
  PsiElement getNameIdentifier();

  ItemPresentation getPresentation();

}
