package demo.kafka.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class EastgateKafkaProducer {

	private String topic;
	private String mess;
	private int partition;
	private String key;

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public void setMess(String mess) {
		this.mess = mess;
	}

	public void setPartition(int partition) {
		this.partition = partition;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public void publishMessDefault() {
		kafkaTemplate.send(this.topic, this.mess);
	}

	public void publishMessWithKey() {
		kafkaTemplate.send(topic,key,mess);
	}
	public void publishessWithKeyPartition() {
		kafkaTemplate.send(topic, partition, key, mess);
	}
}