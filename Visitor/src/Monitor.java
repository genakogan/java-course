package Visitor.src;

public class Monitor implements ComputerPart {

	 public void accept(ComputerPartVisitor computerPartVisitor) { 
	      computerPartVisitor.visit(this); 
	   } 
	} 
