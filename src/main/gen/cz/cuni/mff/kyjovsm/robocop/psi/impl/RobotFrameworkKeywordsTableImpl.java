// This is a generated file. Not intended for manual editing.
package cz.cuni.mff.kyjovsm.robocop.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static cz.cuni.mff.kyjovsm.robocop.parser.RobotFrameworkTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import cz.cuni.mff.kyjovsm.robocop.psi.*;
import cz.cuni.mff.kyjovsm.robocop.elements.RobotFrameworkImplUtil;
import com.intellij.navigation.ItemPresentation;

public class RobotFrameworkKeywordsTableImpl extends ASTWrapperPsiElement implements RobotFrameworkKeywordsTable {

  public RobotFrameworkKeywordsTableImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RobotFrameworkVisitor visitor) {
    visitor.visitKeywordsTable(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RobotFrameworkVisitor) accept((RobotFrameworkVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<RobotFrameworkEmptyLine> getEmptyLineList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RobotFrameworkEmptyLine.class);
  }

  @Override
  @NotNull
  public RobotFrameworkKeywordsTableHeader getKeywordsTableHeader() {
    return findNotNullChildByClass(RobotFrameworkKeywordsTableHeader.class);
  }

  @Override
  @NotNull
  public List<RobotFrameworkKeywordDefinition> getKeywordDefinitionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RobotFrameworkKeywordDefinition.class);
  }

  @Override
  @Nullable
  public PsiElement getNameIdentifier() {
    return RobotFrameworkImplUtil.getNameIdentifier(this);
  }

  @Override
  public ItemPresentation getPresentation() {
    return RobotFrameworkImplUtil.getPresentation(this);
  }

}
