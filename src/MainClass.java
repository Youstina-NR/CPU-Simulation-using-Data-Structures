//package dsproject;

import javafx.util.Pair;

/**
 *
 * @author sergi
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        //Doubly Linked List
//        Linked l = new Linked();
//        for (int i = 1; i <= 100; i++) {
//            l.AddSorted(new Pair<Integer, Integer>(i, i));
//        }
//
//        l.printLinked();
//
////        l.popBack();
////        l.popBack();
////        l.printLinked();
////        Queue
//        Queue Q = new Queue();
//
//        for (int i = 0; i < 100; i++) {
//            Q.pushBack(l.popBack());
//        }
////        while (!Q.IsEmpty()) {
////            Pair<Integer, Integer> p = Q.popFront();
////            System.out.println(p.getKey() + " " + p.getValue());
////        }
//
//        //Stack
//        Stack S = new Stack();
//        while (!Q.IsEmpty()) {
//            S.pushBack(Q.popFront());
//        }
//        while (!S.isEmpty()) {
//            Pair<Integer, Integer> p = S.popBack();
//            System.out.println(p.getKey() + " " + p.getValue());
//        }
//
//
        //Main
        //Main
        Queue Q1 = new Queue();
        Queue Q2 = new Queue();
        Queue Q3 = new Queue();
        Stack S2 = new Stack();
        Linked L2 = new Linked();
        int printed = 0;
        int Stage = 0, Pr = 0, RS2 = 0;
        for (int i = 0; printed <= 100;) {
            Stage = RandomGen(4);
            //System.out.println("i = " + i + "   Stage = " + Stage);

            switch (Stage) {
                case 1:
//                    System.out.println("Case 1");
                    if (i <= 100) {
                        Pr = RandomGen(5);
                        Q1.pushBack(new Pair<Integer, Integer>(i, Pr));
                        i++;
                    }
                    break;
                case 2:
                    System.out.println("Case 2");
                    if (!Q1.IsEmpty()) 
                    {
                        System.err.println("s11");
                        if (S2.getSize() < Q2.getSize() && S2.getSize() < L2.getSize()) 
                        {
                            System.err.println("s1");
                            S2.pushBack(Q1.popFront());
                        }
                        else if (Q2.getSize() < S2.getSize() && Q2.getSize() < L2.getSize()) 
                        {
                            System.err.println("s2");

                            Q2.pushBack(Q1.popFront());
                        } 
                        else if (L2.getSize() < S2.getSize() && L2.getSize() < Q2.getSize()) 
                        {
                            System.err.println("s3");

                            L2.AddSorted(Q1.popFront());
                        } else 
                        {
                            System.err.println("s4");

                            RS2 = RandomGen(3);
                            switch (RS2) 
                            {
                                case 1:
                                    S2.pushBack(Q1.popFront());
                                    break;
                                case 2:
                                    Q2.pushBack(Q1.popFront());
                                    break;
                                case 3:
                                    L2.AddSorted(Q1.popFront());
                                    break;
                            }
                        }
                    }
                    System.err.println("s5");

                    break;
                case 3:
//                    System.out.println("Case 3");
                    if (!S2.IsEmpty() || !Q2.IsEmpty() || !L2.IsEmpty()) {
                        if (S2.getSize() > Q2.getSize() && S2.getSize() > L2.getSize()) {
                            Q3.pushBack(S2.popBack());
                        } else if (Q2.getSize() > S2.getSize() && Q2.getSize() > L2.getSize()) {
                            Q3.pushBack(Q2.popFront());
                        } else if (L2.getSize() > S2.getSize() && L2.getSize() > Q2.getSize()) {
                            Q3.pushBack(L2.popBack());
                        } else {
                            RS2 = RandomGen(3);
                            Pair<Integer, Integer> in = null;
                            switch (RS2) {
                                case 1:
                                    if (!S2.IsEmpty()) {
                                        Q3.pushBack(S2.popBack());
                                    }
                                    break;
                                case 2:
                                    if (!Q2.IsEmpty()) {
                                        Q3.pushBack(Q2.popFront());
                                    }
                                    break;
                                case 3:
                                    if (!L2.IsEmpty()) {
                                        Q3.pushBack(L2.popBack());
                                    }
                                    break;
                            }
                        }
                    }
                    break;
                case 4:
//                    System.out.println("Case 4");
                    if (!Q3.IsEmpty()) {
                        printed++;
                        Pair print = Q3.popFront();
                        System.out.println(print.getKey() + "     " + print.getValue());
                    }
                    break;
                default:
                    break;
            }
        }
//        while (!Q3.IsEmpty()) {
//            Pair<Integer, Integer> pair = Q3.popFront();
//            System.out.println(pair.getKey() + " " + pair.getValue());
//        }
    }

    static int RandomGen(int a) {
        return (int) (Math.random() * a) + 1;
    }

}
