package exception.ex2;

public class NetworkServiceV2_5 {

    public void sendMessage(String data){
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data); // 추가

        try {
            client.connect();
            client.send(data);
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메시지: " + e.getMessage());
        } finally {
            // catch 에서 잡을 순 없어도 finally 로 자원 마무리는 함.
            // finally 후 catch 실행
            client.disconnect();
        }
    }

}
