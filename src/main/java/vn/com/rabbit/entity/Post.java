package vn.com.rabbit.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "bl_post")
public class Post extends AbstractEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "user_id", nullable = false)
	private User users;
	
	@Column(name = "title")
	private String title;

	@Column(name = "summary")
	private String sunmary;

	@Column(name = "content")
	private String content;

	@Column(name = "url")
	private String url;

	@Column(name = "image")
	private String image;

	@Column(name = "published")
	private boolean published;

	@Column(name = "locked")
	private boolean locked;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "posts", cascade = CascadeType.ALL)
	private List<Comment> comment;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "posts", cascade = CascadeType.ALL)
	private List<TagPost> tagPosts;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "posts", cascade = CascadeType.ALL)
	private List<CategoryPost> categoryPosts;
}