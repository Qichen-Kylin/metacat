/* Generated By:JJTree: Do not edit this line. ASTBOOLEAN.java Version 6.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.netflix.metacat.common.partition.parser;

public class ASTBOOLEAN extends SimpleNode {
    public ASTBOOLEAN(int id) {
        super(id);
    }

    public ASTBOOLEAN(PartitionParser p, int id) {
        super(p, id);
    }

    /** Accept the visitor. **/
    public Object jjtAccept(PartitionParserVisitor visitor, Object data) {

        return
            visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=7e8340603e599a7a237489918f589168 (do not edit this line) */
