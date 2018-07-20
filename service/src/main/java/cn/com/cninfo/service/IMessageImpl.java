package cn.com.cninfo.service;

import org.springframework.stereotype.Component;

import cn.com.cninfo.remoteapi.IMessage;

@Component
public class IMessageImpl implements IMessage {

	@Override
	public String echo(String msg) {
		return "echo" + msg;
	}

}
