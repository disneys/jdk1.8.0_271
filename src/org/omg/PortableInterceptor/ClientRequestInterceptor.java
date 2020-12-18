package org.omg.PortableInterceptor;


/**
* org/omg/PortableInterceptor/ClientRequestInterceptor.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/jenkins/workspace/8-2-build-windows-amd64-cygwin/jdk8u271/605/corba/src/share/classes/org/omg/PortableInterceptor/Interceptors.idl
* Wednesday, September 16, 2020 7:17:11 PM UTC
*/


/**
   * Client-side request interceptor.
   * <p>
   * A request Interceptor is designed to intercept the flow of a 
   * request/reply sequence through the ORB at specific points so that 
   * services can query the request information and manipulate the service 
   * contexts which are propagated between clients and servers. The primary 
   * use of request Interceptors is to enable ORB services to transfer 
   * context information between clients and servers. There are two types 
   * of request Interceptors: client-side and server-side. 
   * <p>
   * To write a client-side Interceptor, implement the 
   * <code>ClientRequestInterceptor</code> interface. 
   *
   * @see ClientRequestInfo
   */
public interface ClientRequestInterceptor extends ClientRequestInterceptorOperations, org.omg.PortableInterceptor.Interceptor, org.omg.CORBA.portable.IDLEntity 
{
} // interface ClientRequestInterceptor
