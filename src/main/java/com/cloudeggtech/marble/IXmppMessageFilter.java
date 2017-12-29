package com.cloudeggtech.marble;

public interface IXmppMessageFilter {
	boolean accepts(XmppMessage message);
}
