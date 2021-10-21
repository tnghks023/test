package net.daum.vo;

import lombok.Data;

@Data
public class SampleVO {

    private int mno;//변수명이 JSON의 키이름이 된다.
    private String firstName;//성
    private String lastName;//이름
}
