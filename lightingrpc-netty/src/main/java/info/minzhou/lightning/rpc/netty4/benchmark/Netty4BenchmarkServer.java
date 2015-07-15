package info.minzhou.lightning.rpc.netty4.benchmark;
/**
 * nfs-rpc
 *   Apache License
 *
 *   http://code.google.com/p/nfs-rpc (c) 2011
 */

import info.minzhou.lightning.rpc.benchmark.AbstractBenchmarkServer;
import info.minzhou.lightning.rpc.netty4.server.Netty4Server;
import info.minzhou.lightning.rpc.server.Server;

/**
 * Netty RPC Benchmark Server
 *
 * @author <a href="mailto:coderplay@gmail.com">Min Zhou</a>
 */
public class Netty4BenchmarkServer extends AbstractBenchmarkServer {

  public static void main(String[] args) throws Exception {
    new Netty4BenchmarkServer().run(args);
  }

  public Server getServer() {
    return new Netty4Server();
  }

}
