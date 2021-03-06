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

public class RobotFrameworkTestSettingImpl extends ASTWrapperPsiElement implements RobotFrameworkTestSetting {

  public RobotFrameworkTestSettingImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RobotFrameworkVisitor visitor) {
    visitor.visitTestSetting(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RobotFrameworkVisitor) accept((RobotFrameworkVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RobotFrameworkBracketDocumentation getBracketDocumentation() {
    return findChildByClass(RobotFrameworkBracketDocumentation.class);
  }

  @Override
  @Nullable
  public RobotFrameworkBracketTags getBracketTags() {
    return findChildByClass(RobotFrameworkBracketTags.class);
  }

  @Override
  @Nullable
  public RobotFrameworkTestCaseBracketSetup getTestCaseBracketSetup() {
    return findChildByClass(RobotFrameworkTestCaseBracketSetup.class);
  }

  @Override
  @Nullable
  public RobotFrameworkTestCaseBracketTeardown getTestCaseBracketTeardown() {
    return findChildByClass(RobotFrameworkTestCaseBracketTeardown.class);
  }

  @Override
  @Nullable
  public RobotFrameworkTestCaseBracketTemplate getTestCaseBracketTemplate() {
    return findChildByClass(RobotFrameworkTestCaseBracketTemplate.class);
  }

  @Override
  @Nullable
  public RobotFrameworkTestCaseBracketTimeout getTestCaseBracketTimeout() {
    return findChildByClass(RobotFrameworkTestCaseBracketTimeout.class);
  }

}
