
Create database student;
use student;



CREATE TABLE IF NOT EXISTS `address` (
  `aid` int(11) NOT NULL AUTO_INCREMENT,
  `aname` varchar(30) NOT NULL,
  `phone` int(15) NOT NULL,
  `address` varchar(50) NOT NULL,
  `email` varchar(30) NOT NULL,
  `dob` date NOT NULL,
  PRIMARY KEY (`aid`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Dumping data for table `address`
--

INSERT INTO `address` (`aid`, `aname`, `phone`, `address`, `email`, `dob`) VALUES
(1, 'sakshi', 1234567890, '12/23 abcd ngr', 'hello@hi.bye.com', '1995-02-12'),
(2, 'yahool', 420840, '123 altu faltu nagar', 'abcd@xyz.com', '1989-10-23'),
(3, 'gurudev', 123456, '54/gh ngar', 'add@jhgjg.com', '1991-02-23');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE IF NOT EXISTS `login` (
  `lid` int(11) NOT NULL AUTO_INCREMENT,
  `uname` varchar(20) NOT NULL,
  `upass` varchar(15) NOT NULL,
  PRIMARY KEY (`lid`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`lid`, `uname`, `upass`) VALUES
(1, 'sakshi', '123456'),
(2, 'user1', '123456');