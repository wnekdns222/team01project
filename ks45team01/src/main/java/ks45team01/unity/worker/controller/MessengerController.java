package ks45team01.unity.worker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/messenger")
public class MessengerController {

	//사원목록조회
	@GetMapping("/messengerWorkerList")
	public String getWorkerList() {
		
		return "messenger/messenger_worker_list";
	}
	//채팅리스트
	@GetMapping("messengerChatroomList")
	public String getChatroomList() {
		
		return "messenger/messenger_chat_list";
	}
	//채팅방생성
	@GetMapping("/messengerChatroomInsert")
	public String addChatroom() {
		
		return "messenger/messenger_chat_insert";
	}
	//채팅초대
	@GetMapping("/messengerChatroomInviteInsert")
	public String addChatroomInvite() {
		
		return "messenger/messenger_chat_invite_insert";
	}
	//채팅
	@GetMapping("messengerChatDetail")
	public String addChatDetail() {
		
		return "messenger/messenger_chat_invite_insert";
	}
}
