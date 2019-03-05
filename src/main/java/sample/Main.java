package sample;

import org.seasar.example.s2container.helloworld.IMessageProvider;
import org.seasar.framework.container.S2Container;
import org.seasar.framework.container.factory.SingletonS2ContainerFactory;

public class Main {
	public static void main(String[] args) {
		// S2Containerを初期化(app.diconを読み込み)
		SingletonS2ContainerFactory.init();
		
		// IMessageProviderインターフェースを実装したコンポーネントを取得
		S2Container container = SingletonS2ContainerFactory.getContainer();
		IMessageProvider messageProvider = (IMessageProvider)container.getComponent(IMessageProvider.class);
		
		// メッセージを表示
		System.out.println(messageProvider.getMessage());
		
		// S2Containerを破棄
		SingletonS2ContainerFactory.destroy();
		
	}
}
