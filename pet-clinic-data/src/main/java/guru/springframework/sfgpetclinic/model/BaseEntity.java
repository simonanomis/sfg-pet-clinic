package guru.springframework.sfgpetclinic.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class BaseEntity implements Serializable {

  private Long id;

}
