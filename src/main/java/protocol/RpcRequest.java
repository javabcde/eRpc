package protocol;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import protocol.command.Command;

/**
 * Rpc请求类
 * Created by TOM
 * On 2019/9/29 22:12
 */
@Getter
@Setter
@ToString
public class RpcRequest extends BasePacket {

  private Long requestId;
  private String interfaceName;
  private String methodName;
  //参数类型
  private Class<?>[] parameterTypes;
  private Object[] parameters;

  @Override
  public Byte getCommand() {
    return Command.REQUEST.getCommand();
  }
}
