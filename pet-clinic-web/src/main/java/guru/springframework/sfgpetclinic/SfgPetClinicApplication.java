package guru.springframework.sfgpetclinic;

import guru.springframework.sfgpetclinic.examplebeans.FakeDataSource;
import guru.springframework.sfgpetclinic.examplebeans.FakeJmsBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication public class SfgPetClinicApplication {

  public static void main(String[] args) {
    ApplicationContext xctx = SpringApplication.run(SfgPetClinicApplication.class, args);

    FakeDataSource fakeDataSource = (FakeDataSource) xctx.getBean(FakeDataSource.class);
    System.out.println(fakeDataSource);

      FakeJmsBroker fakeJmsBroker = (FakeJmsBroker) xctx.getBean(FakeJmsBroker.class);
      System.out.println(fakeJmsBroker);
  }

}
