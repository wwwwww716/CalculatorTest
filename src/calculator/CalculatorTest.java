package calculator;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @BeforeEach
    public void setup() {
      System.out.println("setup");
    }
    
    @Test
    public void test1() throws Exception {
      System.out.println("test1");		
    }
    
    @Test
    public void test2() throws Exception {
      System.out.println("test2");		
    }
    
    @AfterEach
    public void teardown() {
      System.out.println("teardown");		
    }
    
    // BeforEach 실행 -> Test 실행 -> After Each 실행 반복 
    // Test 실행 순서는 위에서 부터 실행 
}
