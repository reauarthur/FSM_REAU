/*
 * generated by Xtext 2.14.0
 */
package org.xtext.example.mydsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import mydsl.FSM

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class MyDslGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		var myfsm = resource.contents.get(0) as FSM
		fsa.generateFile("Initial.java", vartxt("Initial"))
		fsa.generateFile("Final.java", vartxt("Final"))
		
		
		var inittxt = '''
		package fsm;
		
		public class State{
			String name;
			
			public State(String nameSt){
				this.name = nameSt;
			}
			
			public String getname(){
				return this.name;
				}
				
			public void setname(String newname) {
					this.name = newname;
				}
		} 
		'''
		fsa.generateFile("State.java", inittxt)
		var fsmtext = '''
		package fsm;
		import fsm.State;
		import fsm.Initial;
		import fsm.Final;
		import java.util.Scanner;
		
		public class �myfsm.name�{
			
			public static void main(String[] args) {
				Initial �myfsm.initial.name� = new Initial ("�myfsm.initial.name�");
				Final �myfsm.final.name� = new Final ("�myfsm.final.name�");
				�FOR i : myfsm.state�
					State �i.name� = new State("�i.name�");
				�ENDFOR�
				State EtatCour = new State(�myfsm.initial.name�.getname());
				while(true){
					Scanner sc = new Scanner(System.in);
					System.out.println("Veuillez saisir un trigger :");
					String inpt = sc.nextLine();
					�FOR i : myfsm.transition�
						if(EtatCour.getname().equals(�i.state.get(0).name�.getname()) && inpt.equals("�i.trigger�")){
							EtatCour.setname(�i.state.get(1).name�.getname());
							}
													
					�ENDFOR�
					if(EtatCour.getname() == �myfsm.final.name�.getname()){
						System.out.println("Etat final atteint");
						break;
						}
					System.out.println(EtatCour.getname());
			}
		}
		}'''
		fsa.generateFile(myfsm.name + ".java", fsmtext)
	}
	
	def vartxt(String name) 
		'''
		package fsm;
		import fsm.State;
		
		public class �name� extends State{
			String name;
			
			public �name�(String nameSt){
				super(nameSt)
				this.name = nameSt
			}
			
			public String getname(){
				return this.name;
				}
				
			public void setname(String newname) {
					this.name = newname;
				}
		} 
		'''
}