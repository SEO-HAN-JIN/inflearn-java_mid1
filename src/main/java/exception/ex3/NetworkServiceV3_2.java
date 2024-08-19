package exception.ex3;


import exception.ex3.exception.ConnectExceptionV3;
import exception.ex3.exception.NetworkClientExceptionV3;
import exception.ex3.exception.SendExceptionV3;

public class NetworkServiceV3_2 {

    public void sendMessage(String data){
        String address = "http://example.com";
        NetworkClientV3 client = new NetworkClientV3(address);
        client.initError(data); // 추가

        try {
            client.connect();
            client.send(data);
        } catch (ConnectExceptionV3 e) {
            System.out.println("[연결 오류] 주소: " + e.getAddress() + ", 메시지: " + e.getMessage());
        } catch (NetworkClientExceptionV3 e) {
            System.out.println("[네트워크 오류] 메시지: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("[알 수 없는 오류] 메시지: " + e.getMessage());
        } finally {
            // catch 에서 잡을 순 없어도 finally 로 자원 마무리는 함.
            // finally 후 catch 실행
            client.disconnect();
        }
    }

}
