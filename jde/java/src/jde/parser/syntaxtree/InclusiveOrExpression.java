//
// Generated by JTB 1.1.2
//

package jde.parser.syntaxtree;

/**
 * Grammar production:
 * <PRE>
 * f0 -> ExclusiveOrExpression()
 * f1 -> ( "|" ExclusiveOrExpression() )*
 * </PRE>
 */
public class InclusiveOrExpression implements Node {
   public ExclusiveOrExpression f0;
   public NodeListOptional f1;

   public InclusiveOrExpression(ExclusiveOrExpression n0, NodeListOptional n1) {
      f0 = n0;
      f1 = n1;
   }

   public void accept(jde.parser.visitor.Visitor v) {
      v.visit(this);
   }
}

