package org.zerock.board.dto;

import lombok.*;

import java.time.LocalDateTime;

@Data
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BoardDTO {

    private Long bno;

    private String title;

    private String content;

    private String writerEmail; // 작성자의 이메일(id)

    private String writerName; // 작성자의 이름

    private LocalDateTime regDate;

    private LocalDateTime modDate;

    private int replyCount; // 해당 게시글의 댓글 수
}


/*
 BoardDTO 클래스가 BoardEntity클래스와 다른점은 Member를 참조하는 대신 화면에서 ㅍ필요한 작성자의 이메일과 이름으로 처리하고있는점.
*/