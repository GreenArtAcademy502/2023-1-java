package com.green.java.required;

public class Human {
    private String name;
    private int age;
    private final String gender;
    private final String addr;

    //@RequiredArgsConstructor
    //@Autowired
    public Human(String gender, String addr) {
        this.gender = gender;
        this.addr = addr;
    }
}
