CREATE TABLE blogs
(
  id SERIAL PRIMARY KEY,
  title VARCHAR(500) NOT NULL,
  category_id int NOT NULL,
  description VARCHAR(1000) NOT NULL,
  description_detail VARCHAR(2000) NOT NULL,
  image VARCHAR(128) NOT NULL,
  user_id int NOT NULL,
  create_date VARCHAR(50) NOT NULL,
  views int NOT NULL
);

CREATE TABLE categories
(
  id SERIAL PRIMARY KEY,
  name VARCHAR(50) NOT NULL,
  text VARCHAR(50) NOT NULL
);

CREATE TABLE users
(
  id SERIAL PRIMARY KEY,
  email VARCHAR(128) UNIQUE,
  username VARCHAR(50) NOT NULL
);

ALTER TABLE blogs ADD CONSTRAINT FK_blog_user FOREIGN KEY(user_id) REFERENCES users(id);
ALTER TABLE blogs ADD CONSTRAINT FK_blog_category FOREIGN KEY(category_id) REFERENCES categories(id);

INSERT INTO users
  (email, username)
VALUES
  ('joyce@gmail.com', 'joyce');

INSERT INTO categories
  (name, text)
VALUES
  ('all-post', 'All Post'),
  ('quick-easy', 'Quick Easy'),
  ('vegetarian', 'Vegetarian'),
  ('main-course', 'Main Course');
-- 
INSERT INTO blogs
  (title, category_id,description,description_detail,image,user_id,create_date,views)
VALUES
  ('Italian inspiration on a budget', 1,
    'Create a blog post subtitle that summarizes your post in a few short, punchy sentences and entices your audience to continue reading.',
    'Welcome to your blog post. Use this space to connect with your readers and potential customers in a way that’s current and interesting. Think of it as an ongoing conversation where you can share updates about business, trends, news, and more. Do you have a design in mind for your blog? Whether you prefer a trendy postcard look or youre going for a more editorial style blog - theres a stunning layout for everyone.Youll be posting loads of engaging content, so be sure to keep your blog organized with Categories that also allow visitors to explore more of what interests them. Writing a blog is a great way to position yourself as an authority in your field and captivate your readers attention. Do you want to improve your sites SEO ranking? Consider topics that focus on relevant keywords and relate back to your website or business. You can also add hashtags (#vacation #dream #summer) throughout your posts to reach more people, and help visitors search for relevant content.ogging gives your site a voice, so let your business personality shine through. Choose a great image to feature in your post or add a video for extra engagement. Are you ready to get started? Simply create a new post now.',
    '/images/anh3.png',
    1,
    '2021-07-22',
    2),
  ('Plating made easy: feast with your eyes', 1,
    'Create a blog post subtitle that summarizes your post in a few short, punchy sentences and entices your audience to continue reading.',
    'Welcome to your blog post. Use this space to connect with your readers and potential customers in a way that’s current and interesting. Think of it as an ongoing conversation where you can share updates about business, trends, news, and more. Do you have a design in mind for your blog? Whether you prefer a trendy postcard look or youre going for a more editorial style blog - theres a stunning layout for everyone.Youll be posting loads of engaging content, so be sure to keep your blog organized with Categories that also allow visitors to explore more of what interests them. Writing a blog is a great way to position yourself as an authority in your field and captivate your readers attention. Do you want to improve your sites SEO ranking? Consider topics that focus on relevant keywords and relate back to your website or business. You can also add hashtags (#vacation #dream #summer) throughout your posts to reach more people, and help visitors search for relevant content.ogging gives your site a voice, so let your business personality shine through. Choose a great image to feature in your post or add a video for extra engagement. Are you ready to get started? Simply create a new post now.',
    '/images/anh3.png',
    1,
    '2021-07-22',
    2),
  ('7 salads to spice up your summer', 2,
    'Create a blog post subtitle that summarizes your post in a few short, punchy sentences and entices your audience to continue reading.',
    'Welcome to your blog post. Use this space to connect with your readers and potential customers in a way that’s current and interesting. Think of it as an ongoing conversation where you can share updates about business, trends, news, and more. Do you have a design in mind for your blog? Whether you prefer a trendy postcard look or youre going for a more editorial style blog - theres a stunning layout for everyone.Youll be posting loads of engaging content, so be sure to keep your blog organized with Categories that also allow visitors to explore more of what interests them. Writing a blog is a great way to position yourself as an authority in your field and captivate your readers attention. Do you want to improve your sites SEO ranking? Consider topics that focus on relevant keywords and relate back to your website or business. You can also add hashtags (#vacation #dream #summer) throughout your posts to reach more people, and help visitors search for relevant content.ogging gives your site a voice, so let your business personality shine through. Choose a great image to feature in your post or add a video for extra engagement. Are you ready to get started? Simply create a new post now.',
    '/images/anh3.png',
    1,
    '2021-07-22',
    2),
  ('Sundried tomato and basil spaghettini', 2,
    'Create a blog post subtitle that summarizes your post in a few short, punchy sentences and entices your audience to continue reading.',
    'Welcome to your blog post. Use this space to connect with your readers and potential customers in a way that’s current and interesting. Think of it as an ongoing conversation where you can share updates about business, trends, news, and more. Do you have a design in mind for your blog? Whether you prefer a trendy postcard look or youre going for a more editorial style blog - theres a stunning layout for everyone.Youll be posting loads of engaging content, so be sure to keep your blog organized with Categories that also allow visitors to explore more of what interests them. Writing a blog is a great way to position yourself as an authority in your field and captivate your readers attention. Do you want to improve your sites SEO ranking? Consider topics that focus on relevant keywords and relate back to your website or business. You can also add hashtags (#vacation #dream #summer) throughout your posts to reach more people, and help visitors search for relevant content.ogging gives your site a voice, so let your business personality shine through. Choose a great image to feature in your post or add a video for extra engagement. Are you ready to get started? Simply create a new post now.',
    '/images/anh3.png',
    1,
    '2021-07-22',
    2)
,
  ('Sundried tomato and basil spaghettini', 3,
    'Create a blog post subtitle that summarizes your post in a few short, punchy sentences and entices your audience to continue reading.',
    'Welcome to your blog post. Use this space to connect with your readers and potential customers in a way that’s current and interesting. Think of it as an ongoing conversation where you can share updates about business, trends, news, and more. Do you have a design in mind for your blog? Whether you prefer a trendy postcard look or youre going for a more editorial style blog - theres a stunning layout for everyone.Youll be posting loads of engaging content, so be sure to keep your blog organized with Categories that also allow visitors to explore more of what interests them. Writing a blog is a great way to position yourself as an authority in your field and captivate your readers attention. Do you want to improve your sites SEO ranking? Consider topics that focus on relevant keywords and relate back to your website or business. You can also add hashtags (#vacation #dream #summer) throughout your posts to reach more people, and help visitors search for relevant content.ogging gives your site a voice, so let your business personality shine through. Choose a great image to feature in your post or add a video for extra engagement. Are you ready to get started? Simply create a new post now.',
    '/images/anh3.png',
    1,
    '2021-07-22',
    2);

select *
from blogs