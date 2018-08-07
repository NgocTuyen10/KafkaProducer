package demo.kafka.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;



@SpringBootApplication
public class DemoKafkaApplication implements CommandLineRunner{
	
	@Autowired
	private EastgateKafkaProducer kafkaProducer;
	public static void main(String[] args) {
		SpringApplication.run(DemoKafkaApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		kafkaProducer.setTopic("abc");
		kafkaProducer.setMess("987");
		kafkaProducer.publishMessDefault();
	}
}
