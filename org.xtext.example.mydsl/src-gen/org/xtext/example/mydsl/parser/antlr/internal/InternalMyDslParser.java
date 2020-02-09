package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'FSM'", "'final'", "'initial'", "'state'", "','", "'transition'", "'trigger'", "'from'", "'->'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "FSM";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleFSM"
    // InternalMyDsl.g:64:1: entryRuleFSM returns [EObject current=null] : iv_ruleFSM= ruleFSM EOF ;
    public final EObject entryRuleFSM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFSM = null;


        try {
            // InternalMyDsl.g:64:44: (iv_ruleFSM= ruleFSM EOF )
            // InternalMyDsl.g:65:2: iv_ruleFSM= ruleFSM EOF
            {
             newCompositeNode(grammarAccess.getFSMRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFSM=ruleFSM();

            state._fsp--;

             current =iv_ruleFSM; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFSM"


    // $ANTLR start "ruleFSM"
    // InternalMyDsl.g:71:1: ruleFSM returns [EObject current=null] : (otherlv_0= 'FSM' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'final' ( (lv_final_3_0= ruleFinal ) ) otherlv_4= 'initial' ( (lv_initial_5_0= ruleInitial ) ) ( (otherlv_6= 'state' ( (lv_state_7_0= ruleState ) ) (otherlv_8= ',' ( (lv_state_9_0= ruleState ) ) )* ) (otherlv_10= 'transition' ( (lv_transition_11_0= ruleTransition ) ) (otherlv_12= ',' ( (lv_transition_13_0= ruleTransition ) ) )* )* )+ ) ;
    public final EObject ruleFSM() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_final_3_0 = null;

        EObject lv_initial_5_0 = null;

        EObject lv_state_7_0 = null;

        EObject lv_state_9_0 = null;

        EObject lv_transition_11_0 = null;

        EObject lv_transition_13_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( (otherlv_0= 'FSM' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'final' ( (lv_final_3_0= ruleFinal ) ) otherlv_4= 'initial' ( (lv_initial_5_0= ruleInitial ) ) ( (otherlv_6= 'state' ( (lv_state_7_0= ruleState ) ) (otherlv_8= ',' ( (lv_state_9_0= ruleState ) ) )* ) (otherlv_10= 'transition' ( (lv_transition_11_0= ruleTransition ) ) (otherlv_12= ',' ( (lv_transition_13_0= ruleTransition ) ) )* )* )+ ) )
            // InternalMyDsl.g:78:2: (otherlv_0= 'FSM' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'final' ( (lv_final_3_0= ruleFinal ) ) otherlv_4= 'initial' ( (lv_initial_5_0= ruleInitial ) ) ( (otherlv_6= 'state' ( (lv_state_7_0= ruleState ) ) (otherlv_8= ',' ( (lv_state_9_0= ruleState ) ) )* ) (otherlv_10= 'transition' ( (lv_transition_11_0= ruleTransition ) ) (otherlv_12= ',' ( (lv_transition_13_0= ruleTransition ) ) )* )* )+ )
            {
            // InternalMyDsl.g:78:2: (otherlv_0= 'FSM' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'final' ( (lv_final_3_0= ruleFinal ) ) otherlv_4= 'initial' ( (lv_initial_5_0= ruleInitial ) ) ( (otherlv_6= 'state' ( (lv_state_7_0= ruleState ) ) (otherlv_8= ',' ( (lv_state_9_0= ruleState ) ) )* ) (otherlv_10= 'transition' ( (lv_transition_11_0= ruleTransition ) ) (otherlv_12= ',' ( (lv_transition_13_0= ruleTransition ) ) )* )* )+ )
            // InternalMyDsl.g:79:3: otherlv_0= 'FSM' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'final' ( (lv_final_3_0= ruleFinal ) ) otherlv_4= 'initial' ( (lv_initial_5_0= ruleInitial ) ) ( (otherlv_6= 'state' ( (lv_state_7_0= ruleState ) ) (otherlv_8= ',' ( (lv_state_9_0= ruleState ) ) )* ) (otherlv_10= 'transition' ( (lv_transition_11_0= ruleTransition ) ) (otherlv_12= ',' ( (lv_transition_13_0= ruleTransition ) ) )* )* )+
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFSMAccess().getFSMKeyword_0());
            		
            // InternalMyDsl.g:83:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:84:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:84:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:85:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFSMAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFSMRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getFSMAccess().getFinalKeyword_2());
            		
            // InternalMyDsl.g:106:3: ( (lv_final_3_0= ruleFinal ) )
            // InternalMyDsl.g:107:4: (lv_final_3_0= ruleFinal )
            {
            // InternalMyDsl.g:107:4: (lv_final_3_0= ruleFinal )
            // InternalMyDsl.g:108:5: lv_final_3_0= ruleFinal
            {

            					newCompositeNode(grammarAccess.getFSMAccess().getFinalFinalParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_final_3_0=ruleFinal();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFSMRule());
            					}
            					set(
            						current,
            						"final",
            						lv_final_3_0,
            						"org.xtext.example.mydsl.MyDsl.Final");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getFSMAccess().getInitialKeyword_4());
            		
            // InternalMyDsl.g:129:3: ( (lv_initial_5_0= ruleInitial ) )
            // InternalMyDsl.g:130:4: (lv_initial_5_0= ruleInitial )
            {
            // InternalMyDsl.g:130:4: (lv_initial_5_0= ruleInitial )
            // InternalMyDsl.g:131:5: lv_initial_5_0= ruleInitial
            {

            					newCompositeNode(grammarAccess.getFSMAccess().getInitialInitialParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_6);
            lv_initial_5_0=ruleInitial();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFSMRule());
            					}
            					set(
            						current,
            						"initial",
            						lv_initial_5_0,
            						"org.xtext.example.mydsl.MyDsl.Initial");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:148:3: ( (otherlv_6= 'state' ( (lv_state_7_0= ruleState ) ) (otherlv_8= ',' ( (lv_state_9_0= ruleState ) ) )* ) (otherlv_10= 'transition' ( (lv_transition_11_0= ruleTransition ) ) (otherlv_12= ',' ( (lv_transition_13_0= ruleTransition ) ) )* )* )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:149:4: (otherlv_6= 'state' ( (lv_state_7_0= ruleState ) ) (otherlv_8= ',' ( (lv_state_9_0= ruleState ) ) )* ) (otherlv_10= 'transition' ( (lv_transition_11_0= ruleTransition ) ) (otherlv_12= ',' ( (lv_transition_13_0= ruleTransition ) ) )* )*
            	    {
            	    // InternalMyDsl.g:149:4: (otherlv_6= 'state' ( (lv_state_7_0= ruleState ) ) (otherlv_8= ',' ( (lv_state_9_0= ruleState ) ) )* )
            	    // InternalMyDsl.g:150:5: otherlv_6= 'state' ( (lv_state_7_0= ruleState ) ) (otherlv_8= ',' ( (lv_state_9_0= ruleState ) ) )*
            	    {
            	    otherlv_6=(Token)match(input,14,FOLLOW_3); 

            	    					newLeafNode(otherlv_6, grammarAccess.getFSMAccess().getStateKeyword_6_0_0());
            	    				
            	    // InternalMyDsl.g:154:5: ( (lv_state_7_0= ruleState ) )
            	    // InternalMyDsl.g:155:6: (lv_state_7_0= ruleState )
            	    {
            	    // InternalMyDsl.g:155:6: (lv_state_7_0= ruleState )
            	    // InternalMyDsl.g:156:7: lv_state_7_0= ruleState
            	    {

            	    							newCompositeNode(grammarAccess.getFSMAccess().getStateStateParserRuleCall_6_0_1_0());
            	    						
            	    pushFollow(FOLLOW_7);
            	    lv_state_7_0=ruleState();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getFSMRule());
            	    							}
            	    							add(
            	    								current,
            	    								"state",
            	    								lv_state_7_0,
            	    								"org.xtext.example.mydsl.MyDsl.State");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }

            	    // InternalMyDsl.g:173:5: (otherlv_8= ',' ( (lv_state_9_0= ruleState ) ) )*
            	    loop1:
            	    do {
            	        int alt1=2;
            	        int LA1_0 = input.LA(1);

            	        if ( (LA1_0==15) ) {
            	            alt1=1;
            	        }


            	        switch (alt1) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:174:6: otherlv_8= ',' ( (lv_state_9_0= ruleState ) )
            	    	    {
            	    	    otherlv_8=(Token)match(input,15,FOLLOW_3); 

            	    	    						newLeafNode(otherlv_8, grammarAccess.getFSMAccess().getCommaKeyword_6_0_2_0());
            	    	    					
            	    	    // InternalMyDsl.g:178:6: ( (lv_state_9_0= ruleState ) )
            	    	    // InternalMyDsl.g:179:7: (lv_state_9_0= ruleState )
            	    	    {
            	    	    // InternalMyDsl.g:179:7: (lv_state_9_0= ruleState )
            	    	    // InternalMyDsl.g:180:8: lv_state_9_0= ruleState
            	    	    {

            	    	    								newCompositeNode(grammarAccess.getFSMAccess().getStateStateParserRuleCall_6_0_2_1_0());
            	    	    							
            	    	    pushFollow(FOLLOW_7);
            	    	    lv_state_9_0=ruleState();

            	    	    state._fsp--;


            	    	    								if (current==null) {
            	    	    									current = createModelElementForParent(grammarAccess.getFSMRule());
            	    	    								}
            	    	    								add(
            	    	    									current,
            	    	    									"state",
            	    	    									lv_state_9_0,
            	    	    									"org.xtext.example.mydsl.MyDsl.State");
            	    	    								afterParserOrEnumRuleCall();
            	    	    							

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop1;
            	        }
            	    } while (true);


            	    }

            	    // InternalMyDsl.g:199:4: (otherlv_10= 'transition' ( (lv_transition_11_0= ruleTransition ) ) (otherlv_12= ',' ( (lv_transition_13_0= ruleTransition ) ) )* )*
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( (LA3_0==16) ) {
            	            alt3=1;
            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:200:5: otherlv_10= 'transition' ( (lv_transition_11_0= ruleTransition ) ) (otherlv_12= ',' ( (lv_transition_13_0= ruleTransition ) ) )*
            	    	    {
            	    	    otherlv_10=(Token)match(input,16,FOLLOW_3); 

            	    	    					newLeafNode(otherlv_10, grammarAccess.getFSMAccess().getTransitionKeyword_6_1_0());
            	    	    				
            	    	    // InternalMyDsl.g:204:5: ( (lv_transition_11_0= ruleTransition ) )
            	    	    // InternalMyDsl.g:205:6: (lv_transition_11_0= ruleTransition )
            	    	    {
            	    	    // InternalMyDsl.g:205:6: (lv_transition_11_0= ruleTransition )
            	    	    // InternalMyDsl.g:206:7: lv_transition_11_0= ruleTransition
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getFSMAccess().getTransitionTransitionParserRuleCall_6_1_1_0());
            	    	    						
            	    	    pushFollow(FOLLOW_7);
            	    	    lv_transition_11_0=ruleTransition();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getFSMRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"transition",
            	    	    								lv_transition_11_0,
            	    	    								"org.xtext.example.mydsl.MyDsl.Transition");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }

            	    	    // InternalMyDsl.g:223:5: (otherlv_12= ',' ( (lv_transition_13_0= ruleTransition ) ) )*
            	    	    loop2:
            	    	    do {
            	    	        int alt2=2;
            	    	        int LA2_0 = input.LA(1);

            	    	        if ( (LA2_0==15) ) {
            	    	            alt2=1;
            	    	        }


            	    	        switch (alt2) {
            	    	    	case 1 :
            	    	    	    // InternalMyDsl.g:224:6: otherlv_12= ',' ( (lv_transition_13_0= ruleTransition ) )
            	    	    	    {
            	    	    	    otherlv_12=(Token)match(input,15,FOLLOW_3); 

            	    	    	    						newLeafNode(otherlv_12, grammarAccess.getFSMAccess().getCommaKeyword_6_1_2_0());
            	    	    	    					
            	    	    	    // InternalMyDsl.g:228:6: ( (lv_transition_13_0= ruleTransition ) )
            	    	    	    // InternalMyDsl.g:229:7: (lv_transition_13_0= ruleTransition )
            	    	    	    {
            	    	    	    // InternalMyDsl.g:229:7: (lv_transition_13_0= ruleTransition )
            	    	    	    // InternalMyDsl.g:230:8: lv_transition_13_0= ruleTransition
            	    	    	    {

            	    	    	    								newCompositeNode(grammarAccess.getFSMAccess().getTransitionTransitionParserRuleCall_6_1_2_1_0());
            	    	    	    							
            	    	    	    pushFollow(FOLLOW_7);
            	    	    	    lv_transition_13_0=ruleTransition();

            	    	    	    state._fsp--;


            	    	    	    								if (current==null) {
            	    	    	    									current = createModelElementForParent(grammarAccess.getFSMRule());
            	    	    	    								}
            	    	    	    								add(
            	    	    	    									current,
            	    	    	    									"transition",
            	    	    	    									lv_transition_13_0,
            	    	    	    									"org.xtext.example.mydsl.MyDsl.Transition");
            	    	    	    								afterParserOrEnumRuleCall();
            	    	    	    							

            	    	    	    }


            	    	    	    }


            	    	    	    }
            	    	    	    break;

            	    	    	default :
            	    	    	    break loop2;
            	    	        }
            	    	    } while (true);


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop3;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFSM"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:254:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:254:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:255:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:261:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:267:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:268:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:268:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:269:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:277:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleState"
    // InternalMyDsl.g:288:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalMyDsl.g:288:46: (iv_ruleState= ruleState EOF )
            // InternalMyDsl.g:289:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalMyDsl.g:295:1: ruleState returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:301:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalMyDsl.g:302:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:302:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalMyDsl.g:303:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalMyDsl.g:303:3: ()
            // InternalMyDsl.g:304:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStateAccess().getStateAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:310:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:311:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:311:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:312:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStateAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleTransition"
    // InternalMyDsl.g:333:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalMyDsl.g:333:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalMyDsl.g:334:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalMyDsl.g:340:1: ruleTransition returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= 'trigger' ( (lv_trigger_2_0= ruleEString ) ) )? otherlv_3= 'from' ( ( ruleEString ) ) (otherlv_5= '->' ( ( ruleEString ) ) )* ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_trigger_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:346:2: ( ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= 'trigger' ( (lv_trigger_2_0= ruleEString ) ) )? otherlv_3= 'from' ( ( ruleEString ) ) (otherlv_5= '->' ( ( ruleEString ) ) )* ) )
            // InternalMyDsl.g:347:2: ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= 'trigger' ( (lv_trigger_2_0= ruleEString ) ) )? otherlv_3= 'from' ( ( ruleEString ) ) (otherlv_5= '->' ( ( ruleEString ) ) )* )
            {
            // InternalMyDsl.g:347:2: ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= 'trigger' ( (lv_trigger_2_0= ruleEString ) ) )? otherlv_3= 'from' ( ( ruleEString ) ) (otherlv_5= '->' ( ( ruleEString ) ) )* )
            // InternalMyDsl.g:348:3: ( (lv_name_0_0= ruleEString ) ) (otherlv_1= 'trigger' ( (lv_trigger_2_0= ruleEString ) ) )? otherlv_3= 'from' ( ( ruleEString ) ) (otherlv_5= '->' ( ( ruleEString ) ) )*
            {
            // InternalMyDsl.g:348:3: ( (lv_name_0_0= ruleEString ) )
            // InternalMyDsl.g:349:4: (lv_name_0_0= ruleEString )
            {
            // InternalMyDsl.g:349:4: (lv_name_0_0= ruleEString )
            // InternalMyDsl.g:350:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTransitionAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_8);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransitionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:367:3: (otherlv_1= 'trigger' ( (lv_trigger_2_0= ruleEString ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:368:4: otherlv_1= 'trigger' ( (lv_trigger_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getTriggerKeyword_1_0());
                    			
                    // InternalMyDsl.g:372:4: ( (lv_trigger_2_0= ruleEString ) )
                    // InternalMyDsl.g:373:5: (lv_trigger_2_0= ruleEString )
                    {
                    // InternalMyDsl.g:373:5: (lv_trigger_2_0= ruleEString )
                    // InternalMyDsl.g:374:6: lv_trigger_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTransitionAccess().getTriggerEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_trigger_2_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTransitionRule());
                    						}
                    						set(
                    							current,
                    							"trigger",
                    							lv_trigger_2_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getFromKeyword_2());
            		
            // InternalMyDsl.g:396:3: ( ( ruleEString ) )
            // InternalMyDsl.g:397:4: ( ruleEString )
            {
            // InternalMyDsl.g:397:4: ( ruleEString )
            // InternalMyDsl.g:398:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTransitionAccess().getStateStateCrossReference_3_0());
            				
            pushFollow(FOLLOW_10);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:412:3: (otherlv_5= '->' ( ( ruleEString ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:413:4: otherlv_5= '->' ( ( ruleEString ) )
            	    {
            	    otherlv_5=(Token)match(input,19,FOLLOW_3); 

            	    				newLeafNode(otherlv_5, grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_4_0());
            	    			
            	    // InternalMyDsl.g:417:4: ( ( ruleEString ) )
            	    // InternalMyDsl.g:418:5: ( ruleEString )
            	    {
            	    // InternalMyDsl.g:418:5: ( ruleEString )
            	    // InternalMyDsl.g:419:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getTransitionRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getTransitionAccess().getStateStateCrossReference_4_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleFinal"
    // InternalMyDsl.g:438:1: entryRuleFinal returns [EObject current=null] : iv_ruleFinal= ruleFinal EOF ;
    public final EObject entryRuleFinal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFinal = null;


        try {
            // InternalMyDsl.g:438:46: (iv_ruleFinal= ruleFinal EOF )
            // InternalMyDsl.g:439:2: iv_ruleFinal= ruleFinal EOF
            {
             newCompositeNode(grammarAccess.getFinalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFinal=ruleFinal();

            state._fsp--;

             current =iv_ruleFinal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFinal"


    // $ANTLR start "ruleFinal"
    // InternalMyDsl.g:445:1: ruleFinal returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleFinal() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:451:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalMyDsl.g:452:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:452:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalMyDsl.g:453:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalMyDsl.g:453:3: ()
            // InternalMyDsl.g:454:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFinalAccess().getFinalAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:460:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:461:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:461:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:462:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFinalAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFinalRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFinal"


    // $ANTLR start "entryRuleInitial"
    // InternalMyDsl.g:483:1: entryRuleInitial returns [EObject current=null] : iv_ruleInitial= ruleInitial EOF ;
    public final EObject entryRuleInitial() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitial = null;


        try {
            // InternalMyDsl.g:483:48: (iv_ruleInitial= ruleInitial EOF )
            // InternalMyDsl.g:484:2: iv_ruleInitial= ruleInitial EOF
            {
             newCompositeNode(grammarAccess.getInitialRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInitial=ruleInitial();

            state._fsp--;

             current =iv_ruleInitial; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInitial"


    // $ANTLR start "ruleInitial"
    // InternalMyDsl.g:490:1: ruleInitial returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleInitial() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:496:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalMyDsl.g:497:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:497:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalMyDsl.g:498:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalMyDsl.g:498:3: ()
            // InternalMyDsl.g:499:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInitialAccess().getInitialAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:505:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:506:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:506:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:507:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInitialAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInitialRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInitial"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000001C002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080002L});

}