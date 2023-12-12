package com.sample.common.exception;

import com.sample.common.consts.SampleErrorCode;
import com.sample.common.consts.ErrorCodeType;

public class BizException extends Exception {

    private static final long serialVersionUID = 4127513561428645333L;

    private ErrorCodeType error;
    private String description;

    public BizException() {
        this(SampleErrorCode.E0001);
    }

    public BizException(String description) {
        super(description);
        error = SampleErrorCode.E0001;
        this.description = description;
    }

    public BizException(ErrorCodeType bizError) {
        super(bizError.getDescription());
        this.error = bizError;
    }

    public BizException(ErrorCodeType bizError, String description) {
        super(description);

        this.error = bizError;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public ErrorCodeType getError() {
        return error;
    }


}
