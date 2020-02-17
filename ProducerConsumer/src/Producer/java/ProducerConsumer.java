package Producer.java;
class ProducerConsumerApp{
	int item;
	void consume() {
		if(item==0) {
			try {
			wait();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		}
		item--;
		notify();
	}
	void produce() {
		if(item==10) {
			try {
				wait();
			}
			catch(InterruptedException e) {
			}
		}
		item++;
		notify();
	}
public class ProducerConsumer {

	public void main(String[] args) {
		
		}

	}

}
