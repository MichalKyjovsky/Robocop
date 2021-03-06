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

public class RobotFrameworkKeywordLineImpl extends ASTWrapperPsiElement implements RobotFrameworkKeywordLine {

  public RobotFrameworkKeywordLineImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RobotFrameworkVisitor visitor) {
    visitor.visitKeywordLine(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RobotFrameworkVisitor) accept((RobotFrameworkVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RobotFrameworkEllipsesLineTest getEllipsesLineTest() {
    return findChildByClass(RobotFrameworkEllipsesLineTest.class);
  }

  @Override
  @Nullable
  public RobotFrameworkExecutionLine getExecutionLine() {
    return findChildByClass(RobotFrameworkExecutionLine.class);
  }

  @Override
  @Nullable
  public RobotFrameworkForLoopIn getForLoopIn() {
    return findChildByClass(RobotFrameworkForLoopIn.class);
  }

  @Override
  @Nullable
  public RobotFrameworkForLoopInRange getForLoopInRange() {
    return findChildByClass(RobotFrameworkForLoopInRange.class);
  }

  @Override
  @Nullable
  public RobotFrameworkKeywordSettingLine getKeywordSettingLine() {
    return findChildByClass(RobotFrameworkKeywordSettingLine.class);
  }

  @Override
  @Nullable
  public RobotFrameworkReturnLine getReturnLine() {
    return findChildByClass(RobotFrameworkReturnLine.class);
  }

}
