// This is a generated file. Not intended for manual editing.
package cz.cuni.mff.kyjovsm.robocop.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import cz.cuni.mff.kyjovsm.robocop.elements.references.RobotFrameworkNamedElement;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiReference;
import com.intellij.util.IncorrectOperationException;

public interface RobotFrameworkLibraryReference extends RobotFrameworkNamedElement {

  @Nullable
  PsiReference getReference();

  @NotNull
  PsiReference[] getReferences();

  @Nullable
  @NonNls
  String getName();

  PsiElement setName(@NonNls @NotNull String newName) throws IncorrectOperationException;

  @Nullable
  PsiElement getNameIdentifier();

  PsiElement handleElementRename(String name);

  ItemPresentation getPresentation();

}
