package com.bahadiraygul.gallerist.service.impl;

import com.bahadiraygul.gallerist.exception.BaseException;
import com.bahadiraygul.gallerist.exception.ErrorMessage;
import com.bahadiraygul.gallerist.exception.MessageType;
import com.bahadiraygul.gallerist.service.IAddressService;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements IAddressService {

    public void test(){
        throw new BaseException(new ErrorMessage(MessageType.NO_RECORD_EXIST,null));
    }
}
