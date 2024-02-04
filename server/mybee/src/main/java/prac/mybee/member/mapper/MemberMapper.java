package prac.mybee.member.mapper;

import java.util.List;
import java.util.Optional;

import org.apache.ibatis.annotations.Param;
import prac.mybee.member.model.Member;
import prac.mybee.member.model.Searchform;

public interface MemberMapper {
    void save(Member member);
    Optional<Member> findById(Long id);
     List<Member> findAll(Searchform form);
    void updateMember(@Param("id") Long id, @Param("updateParam") Member updateParam);
    void addView(Long postId);
    void deleteMember(Long postId);
}