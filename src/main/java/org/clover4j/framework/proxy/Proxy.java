package org.clover4j.framework.proxy;

/**
 * 代理接口
 * @author smallclover
 * @create 2017-01-17
 * @since 2.0.0
 */
public interface Proxy {

    /**
     * 执行链式代理,执行的顺序按照添加到链上的先后顺序
     * @param proxyChain
     * @return
     * @throws Throwable
     */
    Object doProxy(ProxyChain proxyChain) throws Throwable;
}
