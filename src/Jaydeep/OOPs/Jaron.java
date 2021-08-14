package Jaydeep.OOPs;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

import java.sql.SQLOutput;
import java.util.logging.Logger;

@RequiredArgsConstructor
@NoArgsConstructor
@Log4j2
public class Jaron {

  //  Logger log = Logger.getLogger();
    @NonNull
    public String a1;
    public int a2;

    @NonNull
    String a3;

    public void hasna(){
        System.out.println("Has raha hu");
    }

  public void hasna2(){
    System.out.println("Has raha hu2");
  }





}
