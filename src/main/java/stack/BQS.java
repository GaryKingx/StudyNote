package stack;

import sun.misc.Queue;
import java.util.Stack;


/**
 * Bag、Queue、Stack
 * create by frank
 * on 2017/01/06
 */
public class BQS {

//   private static final Logger logger = LoggerFactory.getLogger(stack.BQS.class);

    public static void bag(){
//        Bag<Integer> bag = new Bag<>;
        
    }


    public static  void queue(){

        Queue<Integer> queue = new Queue<Integer>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

       while(!queue.isEmpty()){
           try {
//               logger.info("Queue:"+queue.dequeue());
               System.out.println("Queue:"+queue.dequeue());
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }

    }

    public static void stack(){

        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        while (!stack.empty());
//        logger.info("Stack:"+stack.pop());
        System.out.println("Stack:"+stack.pop());
    }



    public static void main(String args[]){

//        stack.BQS.queue();
        BQS.stack();
    }
}
