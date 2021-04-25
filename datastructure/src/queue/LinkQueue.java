package queue;

public class LinkQueue<T> {
    private QNode<T> front;//队头指针
    private QNode<T> rear;//队尾指针
    private int maxSize;//为了便于操作，使用这个变量表示链队的数据容量

    //初始化
    public LinkQueue(){
        this.front = new QNode<T>();
        this.rear = new QNode<T>();
        this.maxSize = 0;
    }

    //初始化队列
    public void initQueue(){
        front.next = null;
        rear.next = null;
        maxSize = 0;
    }

    //队空判断
    public boolean isNull(){
        if(front.next==null || rear.next==null)
            return true;
        else
            return false;
    }

    //进队
    public void push(QNode<T> node){
        if(isNull()){
            //第一次
            front.next = node;
            rear.next = node;
            maxSize++;
        }
        else{
            node.next = front.next;
            front.next = node;
            maxSize++;
        }
    }
    //出队
    public QNode<T> pop(){
        if(isNull())
            return null;//队为空时，无法出队
        else if(maxSize==1){
            //队只有一个元素时直接初始化即可
            QNode<T> node  = front.next;
            initQueue();
            return node;
        }
        else{
            //准备工作
            QNode<T> p = front;//使用p指针来遍历队列
            for(int i=1;i<maxSize-1;i++)
                p = p.next;
            //pop
            QNode<T> node = rear.next;
            rear.next = p.next;
            maxSize--;
            return node;
        }
    }

}

//链队结点
class QNode<T>{
    private T data;//数据域
    public QNode<T> next;//指针域

    //初始化1
    public QNode(){
        this.data = null;
        this.next = null;
    }
    //初始化2
    public QNode(T data){
        this.data = data;
        this.next = null;
    }

    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }

}
