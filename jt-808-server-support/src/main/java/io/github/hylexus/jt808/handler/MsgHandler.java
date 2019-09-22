package io.github.hylexus.jt808.handler;

import com.google.common.collect.Sets;
import io.github.hylexus.jt808.msg.MsgType;
import io.github.hylexus.jt808.msg.RequestMsgBody;
import io.github.hylexus.jt808.msg.RequestMsgCommonProps;
import io.github.hylexus.jt808.session.Session;

import java.io.IOException;
import java.util.Set;

/**
 * @author hylexus
 * createdAt 2019/2/1
 **/
public interface MsgHandler<T extends RequestMsgBody> {

    default Set<MsgType> getSupportedMsgTypes() {
        return Sets.newHashSet();
    }

    void handleMsg(RequestMsgCommonProps commonProps, T body, Session session) throws IOException, InterruptedException;

}