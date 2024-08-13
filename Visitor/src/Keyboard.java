package Visitor.src;

public class Keyboard implements ComputerPart  {

	 public void accept(ComputerPartVisitor computerPartVisitor) { 
	      computerPartVisitor.visit(this); 
	   } 
	} 