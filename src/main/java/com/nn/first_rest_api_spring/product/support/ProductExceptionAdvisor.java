package com.nn.first_rest_api_spring.product.support;

import com.nn.first_rest_api_spring.product.support.exception.ProductNotFoundException;
import com.nn.first_rest_api_spring.shared.api.response.ErrorMessageResponse;
import org.slf4j.*;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@ControllerAdvice
public class ProductExceptionAdvisor {

    private static  final Logger LOG = LoggerFactory.getLogger(ProductExceptionAdvisor.class);

    @ExceptionHandler(ProductNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ResponseBody
    public ErrorMessageResponse productNotFound(Exception e) {
        LOG.error(e.getMessage(), e);
        return new ErrorMessageResponse(e.getLocalizedMessage());
    }
}
