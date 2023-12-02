package com.example.testrepo.member;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
class MemberRepositoryTest {

    @Autowired
    private MemberRepository memberRepository;

    @Transactional
    @Test
    void memberTest(){
        // given
        final String MEMBER_ID = "member1";
        final String 회원1 = "회원1";
        final Member member = new Member(MEMBER_ID, 회원1);

        memberRepository.initTable();
        memberRepository.save(member);

        // when
        Member findMember = memberRepository.find(MEMBER_ID);

        // then
        assertThat(findMember.getMemberId()).isEqualTo(member.getMemberId());
        assertThat(findMember.getName()).isEqualTo(member.getName());
    }


}
