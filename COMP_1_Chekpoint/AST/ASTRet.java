/* Generated By:JJTree: Do not edit this line. ASTRet.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTRet extends SimpleNode {
  private String name;

  public ASTRet(int id) {
    super(id);
  }

  public ASTRet(Jmm p, int id) {
    super(p, id);
  }

  /**
   * Set the name.
   * @param n the name
   */
  public void setName(String n) {
    name = n;
  }

  /**
   * {@inheritDoc}
   * @see org.javacc.examples.jjtree.eg2.SimpleNode#toString()
   */
  public String toString() {
    return JmmTreeConstants.jjtNodeName[id] + " - " + name;
  }

}
/* JavaCC - OriginalChecksum=39533ed81c0340aeb2f926549862c21e (do not edit this line) */