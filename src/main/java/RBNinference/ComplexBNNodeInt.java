/*
* ComplexBNNodeInt.java 
* 
* Copyright (C) 2004 Aalborg University
*                    
*
* contact:
* jaeger@cs.auc.dk    www.cs.auc.dk/~jaeger/Primula.html
*
* This program is free software; you can redistribute it and/or
* modify it under the terms of the GNU General Public License
* as published by the Free Software Foundation; either version 2
* of the License, or (at your option) any later version.
*
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License
* along with this program; if not, write to the Free Software
* Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
*/

package RBNinference;
import RBNpackage.*;
import RBNExceptions.*;

public interface ComplexBNNodeInt{

    
    public abstract  ProbForm probform();
    
    /* Returns true if this node is isolated (no parents or 
     * children, and its probability formula when evaluated
     * over rels is constant zero (independent of instantiations
     * of probabilistic atoms possibly contained in 
     * formula)
     */
    public abstract boolean isIsolatedZeroNode(RelStruc rels)throws RBNCompatibilityException;
    
    public abstract void instantiate(int truthval);
    
    public abstract void addToChildren(ComplexBNNodeInt newchild);

    public abstract void addToParents(ComplexBNNodeInt newpar);
    

}
