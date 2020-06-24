package com.poc.authserver.usuario;

import java.util.Collections;
import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements UserDetailsService {
  @Autowired
  private BCryptPasswordEncoder encoder;
  
  @Autowired
  private UsuarioRepository repository;
  
  @PostConstruct
  public void popular() {
    Usuario usuario = new Usuario();
    usuario.setNome("nicao");
    usuario.setSenha(encoder.encode("nicao123"));
    repository.save(usuario);

    Usuario allineLopes = new Usuario();
    allineLopes.setNome("alline-lopes");
    allineLopes.setSenha(encoder.encode("alline-lopes123"));
    repository.save(allineLopes);

    Usuario andreVinicius = new Usuario();
    andreVinicius.setNome("andre-vinicius");
    andreVinicius.setSenha(encoder.encode("andre-vinicius123"));
    repository.save(andreVinicius);

    Usuario angelaValentim = new Usuario();
    angelaValentim.setNome("angela-valentim");
    angelaValentim.setSenha(encoder.encode("angela-valentim123"));
    repository.save(angelaValentim);

    Usuario cynthiaCarvalho = new Usuario();
    cynthiaCarvalho.setNome("cynthia-carvalho");
    cynthiaCarvalho.setSenha(encoder.encode("cynthia-carvalho123"));
    repository.save(cynthiaCarvalho);

    Usuario danielTorquato = new Usuario();
    danielTorquato.setNome("daniel-torquato");
    danielTorquato.setSenha(encoder.encode("daniel-torquato123"));
    repository.save(danielTorquato);

    Usuario danielVictor = new Usuario();
    danielVictor.setNome("daniel-victor");
    danielVictor.setSenha(encoder.encode("daniel-victor123"));
    repository.save(danielVictor);

    Usuario daniloFreitas = new Usuario();
    daniloFreitas.setNome("danilo-freitas");
    daniloFreitas.setSenha(encoder.encode("danilo-freitas123"));
    repository.save(daniloFreitas);

    Usuario daviPires = new Usuario();
    daviPires.setNome("davi-pires");
    daviPires.setSenha(encoder.encode("davi-pires123"));
    repository.save(daviPires);

    Usuario felipeSarmento = new Usuario();
    felipeSarmento.setNome("felipe-sarmento");
    felipeSarmento.setSenha(encoder.encode("felipe-sarmento123"));
    repository.save(felipeSarmento);

    Usuario fellipeRoveri = new Usuario();
    fellipeRoveri.setNome("fellipe-roveri");
    fellipeRoveri.setSenha(encoder.encode("fellipe-roveri123"));
    repository.save(fellipeRoveri);

    Usuario joaoAugusto = new Usuario();
    joaoAugusto.setNome("joao-augusto");
    joaoAugusto.setSenha(encoder.encode("joao-augusto123"));
    repository.save(joaoAugusto);

    Usuario jonathanRoberto = new Usuario();
    jonathanRoberto.setNome("jonathan-roberto");
    jonathanRoberto.setSenha(encoder.encode("jonathan-roberto123"));
    repository.save(jonathanRoberto);

    Usuario leandroGuilherme = new Usuario();
    leandroGuilherme.setNome("leandro-guilherme");
    leandroGuilherme.setSenha(encoder.encode("leandro-guilherme123"));
    repository.save(leandroGuilherme);

    Usuario marianaAfonso = new Usuario();
    marianaAfonso.setNome("mariana-afonso");
    marianaAfonso.setSenha(encoder.encode("mariana-afonso123"));
    repository.save(marianaAfonso);

    Usuario nivioPinheiro = new Usuario();
    nivioPinheiro.setNome("nivio-pinheiro");
    nivioPinheiro.setSenha(encoder.encode("nivio-pinheiro123"));
    repository.save(nivioPinheiro);

    Usuario raquelBatista = new Usuario();
    raquelBatista.setNome("raquel-batista");
    raquelBatista.setSenha(encoder.encode("raquel-batista123"));
    repository.save(raquelBatista);

    Usuario robertoMiyahara = new Usuario();
    robertoMiyahara.setNome("roberto-miyahara");
    robertoMiyahara.setSenha(encoder.encode("roberto-miyahara123"));
    repository.save(robertoMiyahara);

    Usuario rodrigoCarvalho = new Usuario();
    rodrigoCarvalho.setNome("rodrigo-carvalho");
    rodrigoCarvalho.setSenha(encoder.encode("rodrigo-carvalho123"));
    repository.save(rodrigoCarvalho);

    Usuario tiagoGalvao = new Usuario();
    tiagoGalvao.setNome("tiago-galvao");
    tiagoGalvao.setSenha(encoder.encode("tiago-galvao123"));
    repository.save(tiagoGalvao);

    Usuario williamPimentel = new Usuario();
    williamPimentel.setNome("william-pimentel");
    williamPimentel.setSenha(encoder.encode("william-pimentel123"));
    repository.save(williamPimentel);

    Usuario yuriAndrei = new Usuario();
    yuriAndrei.setNome("yuri-andrei");
    yuriAndrei.setSenha(encoder.encode("yuri-andrei123"));
    repository.save(yuriAndrei);


  }

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    Optional<Usuario> optional = repository.findByNome(username);
    
    if(!optional.isPresent()) {
      throw new UsernameNotFoundException("Usuário não encontrado");
    }
    
    Usuario usuario = optional.get();
    
    SimpleGrantedAuthority authority = new SimpleGrantedAuthority("user");
    
    return new User(usuario.getNome(), usuario.getSenha(), Collections.singletonList(authority));
  }
}
