package demo.kafka.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class EastgateKafkaProducer {


	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;




	public void publish(String topic, int partition, String key, String data) {
		kafkaTemplate.send(topic,partition,key,data);
	}

	public void publishToTopic(String topic, String data) {
		kafkaTemplate.send(topic, data);
	}
	public void publishWithKey(String topic,String key,String data) {
		kafkaTemplate.send(topic, key, data);
	}
	
}