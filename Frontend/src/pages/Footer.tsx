import React from 'react';
import { FaTwitter, FaYoutube, FaInstagram, FaGithub, FaLinkedinIn, FaFacebook } from 'react-icons/fa';
interface ListHeaderProps {
    children: React.ReactNode;
  }
  
  const ListHeader: React.FC<ListHeaderProps> = ({ children }) => {
    return (
      <p className="font-semibold text-lg mb-2 text-whiteAlpha-500">
        {children}
      </p>
    );
  };
  
  interface SocialButtonProps {
    label: string;
    href: string;
    children: React.ReactNode;
  }
const SocialButton: React.FC<SocialButtonProps> = ({ children, label, href }) => {
  return (
    <a
      className="bg-blackAlpha-100 rounded-full w-9 h-9 text-white no-underline inline-flex items-center justify-center cursor-pointer transition-background duration-300 hover:bg-purple-400"
      href={href}
      target="_blank"
      rel="noopener noreferrer"
    >
      <span className="sr-only">{label}</span>
      {children}
    </a>
  );
};

export default function Footer() {
  return (
    <div className="bg-gray-900 text-white">
      <div className="container mx-auto px-10 py-10">
        <div>
          <img className="w-15" src="https://drive.google.com/file/d/1HgSo9mNCsN-AxdElxt-LtoVg0zxhvCAn/view?usp=sharing" alt="" />
        </div>
        <div className="grid grid-cols-1 sm:grid-cols-2 md:grid-cols-3 lg:grid-cols-6 gap-8">
          {/* ... (Rest of the code remains the same) ... */}
          <div className="flex flex-col items-start">
      <ListHeader>HELP</ListHeader>
      <a href="#" className="font-normal text-white">Support & Knowledge</a>
      <a href="#" className="font-normal text-white">Request A Demo</a>
      <a href="#" className="font-normal text-white">Desktop Apps</a>
      <a href="#" className="font-normal text-white">Contact Us</a>
    </div>
    <div className="flex flex-col items-start">
      <ListHeader>HELP</ListHeader>
      <a href="#" className="font-normal text-white">Support & Knowledge</a>
      <a href="#" className="font-normal text-white">Request A Demo</a>
      <a href="#" className="font-normal text-white">Desktop Apps</a>
      <a href="#" className="font-normal text-white">Contact Us</a>
    </div>
    <div className="flex flex-col items-start">
      <ListHeader>HELP</ListHeader>
      <a href="#" className="font-normal text-white">Support & Knowledge</a>
      <a href="#" className="font-normal text-white">Request A Demo</a>
      <a href="#" className="font-normal text-white">Desktop Apps</a>
      <a href="#" className="font-normal text-white">Contact Us</a>
    </div>
        </div>
      </div>
      <div className="flex justify-center space-x-6 mb-30">
      <SocialButton label={'Twitter'} href={'#'}>
              <FaTwitter />
            </SocialButton>
            <SocialButton label={'facebook'} href={'#'}>
              <FaFacebook />
            </SocialButton>
            <SocialButton label={'Instagram'} href={'#'}>
              <FaInstagram />
            </SocialButton>
            <SocialButton label={'YouTube'} href={'#'}>
              <FaYoutube />
            </SocialButton>
            <SocialButton label={'linkdin'} href={'#'}>
              <FaLinkedinIn />
            </SocialButton>
            <SocialButton label={'Github'} href={'#'}>
              <FaGithub/>
            </SocialButton>
      </div>
      <div className="border-t border-solid border-gray-200">
        <div className="container mx-auto py-4 flex flex-col md:flex-row items-center justify-between">
          <p>© 2023 Synth AI Interview. All rights reserved</p>
        </div>
      </div>
    </div>
  );
}
