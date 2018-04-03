USE [TEST_DB]
GO

/****** Object:  Table [dbo].[Author]    Script Date: 2018/4/3 上午 11:53:57 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

SET ANSI_PADDING ON
GO

CREATE TABLE [dbo].[Author](
	[Pk_Author_Id] [int] NOT NULL,
	[FullName] [varchar](255) NULL,
	[MobileNo] [char](10) NULL,
	[Fk_Book_Id] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[Pk_Author_Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO

SET ANSI_PADDING OFF
GO

ALTER TABLE [dbo].[Author]  WITH CHECK ADD FOREIGN KEY([Fk_Book_Id])
REFERENCES [dbo].[Book] ([Pk_Book_Id])
GO
