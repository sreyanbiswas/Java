package Lecture10;

public class QUSEnqueueEfficientClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		QUSEnqueueEfficient queue = new QUSEnqueueEfficient();
		// 10 20 30 40 50
		for (int i = 1; i <= 5; i++) {
			queue.enqueue(i * 10);
		}
		// 10 20 30 40 50
		queue.display();

		System.out.println(queue.dequeue());// 10

		queue.display();// 20 30 40 50

		System.out.println(queue.front());//20
	}

}
