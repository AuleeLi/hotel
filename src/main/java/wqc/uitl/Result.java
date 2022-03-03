package wqc.uitl;

import lombok.Data;

@Data
public class Result {
    private String message;
    private Integer code;
    private Object data;

    public Result(String message, Integer code, Object data) {
        this.message = message;
        this.code = code;
        this.data = data;
    }

    public Result(String message, Integer code) {
        this.message = message;
        this.code = code;
    }

    public Result(String message) {
        this.message = message;
    }
}
