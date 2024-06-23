public class Queue {
    int item[] = new int[5];
    int front;
    int rear;

    Queue(){
        front = -1;
        rear = -1;
    }

    // check if queue is full
    boolean isfull(){
        if(front == 0 && rear == item.length-1){
            return true;
        }
        return false;
    }

    //check if queue is empty
    boolean isEmpty(){
        if (front == -1)
            return true;
        else
            return false;
    }

    //INSERT ELEMENT TO QUEUE
    void enqueue(int data){
        if(isfull()){
            System.out.println("Queue is full");
        }
        else {
            if (front == -1){
                    front = 0;
            }
            rear++;
            item[rear] = data;
            System.out.println("Insert " + data);
        }
    }

    //DELETE ELEMENT FROM QUEUE
    int deQueue(){
        int data;
    //if queue is empty
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return (-1);
        }
        else{
            //remove element from the front of queue
            data = item[front];

            //if the queue has only one element
            if(front >= rear){
                front = -1;
                rear = -1;
            }
            else {
                //mark next element as front
                front++;
            }
            System.out.println(data + " deleted");
            return data;
        }
    }

    //display element of the queue
    void display(){
        int i;
        if(isEmpty()){
            System.out.println("Empty Queue");
        }
        else{
            //display the front of queue
            System.out.println("Front index " + front);

            //display the element of the queue
            System.out.println("Item ");
            for(i = front; i <= rear; i++)
                System.out.println(item[i] + " ");

            //display the rear of queue
            System.out.println("Rear index " + rear);
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();

        // try to delete element from the queue
        // currently queue is empty
        // so deletion is not possible
        q.deQueue();

        //insert element of the queue
        for(int i = 0; i < 6; i++){
            q.enqueue(i);
        }
        // 6th element can't be added to queue because queue is full
        q.enqueue(6);

        q.display();

        // deQueue removes element entered first
        q.deQueue();

        // Now we have just 4 elements
        q.display();
    }
}
